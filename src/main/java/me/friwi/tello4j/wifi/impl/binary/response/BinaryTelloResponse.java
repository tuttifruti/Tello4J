/*
 * Copyright 2020 Fritz Windisch
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package me.friwi.tello4j.wifi.impl.binary.response;

import me.friwi.tello4j.wifi.impl.response.CommandResultType;
import me.friwi.tello4j.wifi.model.command.TelloCommand;
import me.friwi.tello4j.wifi.model.response.TelloResponse;

public class BinaryTelloResponse extends TelloResponse {
    public BinaryTelloResponse(TelloCommand command, CommandResultType commandResultType, String message) {
        super(command, commandResultType, message);
    }
}
