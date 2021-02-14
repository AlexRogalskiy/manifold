/*
 * Copyright (c) 2021 - Manifold Systems LLC
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

package manifold.ext.props.rt.api;

import manifold.rt.api.anno.any;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Makes the property writable so it can be used in assignments. Specifying {@code @set} without a {@code @get}
 * indicates the is <i>write-only</i>, thus you must specify {@code @get} for the field to be readable, or use
 * {@code @prop}. Note, use of {@code @prop} is redundant when specifying {@code @set}.
 *
 * @see prop
 */
@Target( {ElementType.FIELD} )
@Retention( RetentionPolicy.CLASS )
public @interface set
{
  PropOption[] value() default {};
  any[] annos() default {};
  any[] param() default {};
}