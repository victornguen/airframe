/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wvlet.airframe.msgpack.spi

trait ErrorCode

/**
  *
  */
object ErrorCode {
  // Type conversion errors (data is valid, but reading to the target type failed)
  trait TypeConversionError     extends ErrorCode
  case object INTEGER_OVERFLOW  extends TypeConversionError
  case object INVALID_TYPE_CAST extends TypeConversionError
  case object INVALID_TYPE      extends TypeConversionError

  // Internal errors
  trait InternalError             extends ErrorCode
  case object INSUFFICIENT_BUFFER extends InternalError

  // Format errors (incompatible MessagePack format is used)
  trait InvalidFormatError          extends ErrorCode
  case object NEVER_USED_FORMAT     extends InvalidFormatError
  case object INVALID_STRING_CODING extends InvalidFormatError
  case object TOO_LARGE_MESSAGE     extends InvalidFormatError
  case object INVALID_EXT_FORMAT    extends InvalidFormatError

}
