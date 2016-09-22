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

package tk.martijn_heil.well.enchantments


enum class EnchantmentType(val id: Int, val maxLevel: Int) {

    PROTECTION_ENVIRONMENT(0, 4),
    PROTECTION_FIRE(1, 4),
    PROTECTION_FALLING(2, 4),
    PROTECTION_EXPLOSION(3, 4),
    PROTECTION_PROJECTILE(4, 4),
    RESPIRATION(5, 3),
    AQUA_AFFINITY(6, 1),
    THORNS(7, 3),
    DEPTH_STRIDER(8, 3),
    FROST_WALKER(9, 2),
    SHARPNESS(16, 5),
    SMITE(17, 5),
    BANE_OF_ARTHROPODS(18, 5),
    KNOCKBACK(19, 2),
    FIRE_ASPECT(20, 2),
    LOOTING(21, 3),
    EFFICIENCY(32, 5),
    SILK_TOUCH(33, 1),
    UNBREAKING(34, 3),
    FORTUNE(35, 3),
    POWER(48, 5),
    PUNCH(49, 2),
    FLAME(50, 1),
    INFINITY(51, 1),
    LUCK_OF_THE_SEA(61, 3),
    LURE(62, 3),
    MENDING(70, 1);




//    fun conflictsWith(other: Enchantment): Boolean {
//
//    }


    fun fromId(id: Int): EnchantmentType? {
        EnchantmentType.values().forEach { if(it.id == id) return it; }
        return null;
    }
}