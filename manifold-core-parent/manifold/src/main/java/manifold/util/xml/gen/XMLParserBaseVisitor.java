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

package manifold.util.xml.gen;
// Generated from XMLParser.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link XMLParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class XMLParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements XMLParserVisitor<T>
{
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitDocument( XMLParser.DocumentContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitProlog( XMLParser.PrologContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitContent( XMLParser.ContentContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitElement( XMLParser.ElementContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitReference( XMLParser.ReferenceContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitAttribute( XMLParser.AttributeContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitChardata( XMLParser.ChardataContext ctx )
  {
    return visitChildren( ctx );
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  public T visitMisc( XMLParser.MiscContext ctx )
  {
    return visitChildren( ctx );
  }
}
