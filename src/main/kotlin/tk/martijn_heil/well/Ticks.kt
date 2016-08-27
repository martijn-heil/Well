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

package tk.martijn_heil.well


class Ticks(@Volatile private var amount: Int) {

    fun plus(ticks: Ticks): Ticks {
        return Ticks(amount + ticks.amount)
    }

    fun plus(ticksAmount: Int): Ticks {
        return Ticks(amount + ticksAmount)
    }

    fun minus(ticks: Ticks): Ticks {
        return Ticks(amount - ticks.amount)
    }

    fun minus(ticksAmount: Int): Ticks {
        return Ticks(amount - ticksAmount)
    }

    fun inc(ticks: Ticks) {
        amount += ticks.amount
    }

    fun inc(ticksAmount: Int) {
        amount += ticksAmount
    }

    fun dec(ticks: Ticks) {
        amount -= ticks.amount
    }

    fun dec(ticksAmount: Int) {
        amount -= ticksAmount
    }

    fun times(ticks: Ticks): Ticks {
        return Ticks(amount * ticks.amount)
    }

    fun times (integer: Int): Ticks {
        return Ticks(amount * integer)
    }

    fun div(ticks: Ticks): Ticks {
        return Ticks(amount / ticks.amount)
    }

    fun div(integer: Int): Ticks {
        return Ticks(amount / integer)
    }

    fun mod(ticks: Ticks): Ticks {
        return Ticks(amount % ticks.amount)
    }

    fun mod(integer: Int): Ticks {
        return Ticks(amount % integer)
    }

    fun toInteger(): Int {
        return amount
    }

    fun toMilliseconds(): Int {
        return amount / TICKS_PER_SECOND * 1000
    }

    fun toSeconds(): Int {
        return amount / TICKS_PER_SECOND
    }

    fun toMinutes(): Int {
        return amount / TICKS_PER_SECOND / 60
    }

    fun toHours(): Int {
        return amount / TICKS_PER_SECOND / 60 / 60
    }

    fun toDays(): Int {
        return amount / TICKS_PER_SECOND / 60 / 60 / 24
    }


    companion object {
        val TICKS_PER_SECOND: Int = 20;
    }
}