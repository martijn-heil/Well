/*
 * MIT License
 *
 * Copyright (c) 2016 Martijn Heil
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tk.martijn_heil.well.entity

import tk.martijn_heil.well.Locatable
import tk.martijn_heil.well.HasVelocity
import tk.martijn_heil.well.Identifiable
import tk.martijn_heil.well.Ticks


interface Entity : Locatable, Identifiable, HasVelocity {
    val entityId: Int
    val isValid: Boolean
    var customName: String
    var customNameVisible: Boolean
    var fallDistance: Float
    var passenger: Entity
    var isGlowing: Boolean
    var isAffectedByGravity: Boolean
    var isInvulnerable: Boolean
    var isSilent: Boolean
    var age: Ticks

    fun ejectPassenger()
    fun leaveVehicle()
    fun remove()
}