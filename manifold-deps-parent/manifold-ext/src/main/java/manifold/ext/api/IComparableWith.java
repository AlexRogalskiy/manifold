/*
 * Copyright (c) 2019 - Manifold Systems LLC
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

package manifold.ext.api;

@Structural
public interface IComparableWith<T> extends Comparable<T>
{
  default boolean compareToWith( T that, String op )
  {
    switch( op )
    {
      case "<":
        return compareTo( that ) < 0;
      case "<=":
        return compareTo( that ) <= 0;
      case ">":
        return compareTo( that ) > 0;
      case ">=":
        return compareTo( that ) >= 0;
      case "==":
        return compareTo( that ) == 0;
      case "!=":
        return compareTo( that ) != 0;
      default:
        throw new IllegalStateException();
    }
  }

  static boolean haveSameValue( Object thiz, Object that, boolean negate )
  {
    if( thiz == that )
    {
      return !negate;
    }
    if( thiz == null || that == null )
    {
      return negate;
    }
    //noinspection unchecked
    return ((IComparableWith)thiz).compareToWith( that, negate ? "!=" : "==" );
  }
}
