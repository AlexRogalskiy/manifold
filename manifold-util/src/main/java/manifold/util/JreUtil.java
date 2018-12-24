/*
 * Copyright (c) 2018 - Manifold Systems LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package manifold.util;

public class JreUtil
{
  public static final int JAVA_VERSION = getJavaVersion();
  private static Boolean _modular;
  private static Boolean _modularRuntime;

  private static int getJavaVersion()
  {
    String version = System.getProperty( "java.version" );
    StringBuilder sb = new StringBuilder();
    for( int i = 0; i < version.length(); i++ )
    {
      char c = version.charAt( i );
      if( Character.isDigit( c ) )
      {
        sb.append( c );
      }
      else
      {
        break;
      }
    }
    int major = Integer.parseInt( sb.toString() );
    major = major == 1 ? 8 : major;
    return major;
  }

  public static boolean isJava8()
  {
    return JAVA_VERSION == 8;
  }

  public static boolean isJava9()
  {
    return JAVA_VERSION == 9;
  }

  @SuppressWarnings("unused")
  public static boolean isJava9orLater()
  {
    return !isJava8();
  }

  public static boolean isJava9Modular_compiler( Object/*Context*/ ctx )
  {
    if( _modular == null )
    {
      if( isJava8() )
      {
        _modular = false;
      }
      else
      {
        //noinspection ConstantConditions
        Object modulesUtil = ReflectUtil.method( ReflectUtil.type( "com.sun.tools.javac.comp.Modules" ), "instance", ReflectUtil.type( "com.sun.tools.javac.util.Context" ) ).invokeStatic( ctx );
        Object defModule = ReflectUtil.method( modulesUtil, "getDefaultModule" ).invoke();
        _modular = defModule != null && !(boolean)ReflectUtil.method( defModule, "isNoModule" ).invoke() && !(boolean)ReflectUtil.method( defModule, "isUnnamed" ).invoke();
      }
    }
    return _modular;
  }

  public static boolean isJava9Modular_runtime()
  {
    if( _modularRuntime == null )
    {
      if( isJava8() )
      {
        _modularRuntime = false;
      }
      else
      {
        //noinspection ConstantConditions
        Object /*Module*/ manifoldModule = ReflectUtil.method( Class.class, "getModule" ).invoke( JreUtil.class );
        _modularRuntime = (boolean)ReflectUtil.method( manifoldModule, "isNamed" ).invoke();
      }
    }
    return _modularRuntime;
  }
}
