/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.kotlin

/**
 * An interface-based "mixin" to easily add a log val to a class, named by the enclosing class. This allows
 * code like this:
 *
 * ```
 * import org.apache.logging.log4j.kotlin.Logging
 *
 * class MyClass: Logging {
 *   // use `logger` as necessary
 * }
 *
 * ```
 *
 * Or declaring the interface on a companion object works just as well:
 *
 * ```
 * import org.apache.logging.log4j.kotlin.logger
 *
 * class MyClass {
 *   companion object: Logging
 *
 *   // use `logger` as necessary
 * }
 *
 * ```
 */
@Deprecated("TODO")
interface Logging {
  @Suppress("unused")
  val logger
    get() = loggerOf(this.javaClass)
}
