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


enum class EnchantmentType(val id: Int, val maxLevel: Int, val minLevel: Int) {}

    /**
     * Provides protection against environmental damage
     */
    PROTECTION_ENVIRONMENTAL(),

    /**
     * Provides protection against fall damage
     */
    PROTECTION_FALL(),

    /**
     * Provides protection against fire damage
     */
    PROTECTION_FIRE(),

    /**
     * Provides protection against projectile damage
     */
    PROTECTION_PROJECTILE(),

    /**
     * Provides protection against explosive damage
     */
    PROTECTION_EXPLOSIONS(),

    /**
     * Provides extra damage when shooting arrows from bows
     */
    ARROW_DAMAGE(),

    /**
     * Sets entities on fire when hit by arrows shot from a bow
     */
    ARROW_FIRE(),

    /**
     * Provides infinite arrows when shooting a bow
     */
    ARROW_INFINITE(),

    /**
     * Provides a knockback when an entity is hit by an arrow from a bow
     */
    ARROW_KNOCKBACK(),

    /**
     * Increases damage against all targets
     */
    DAMAGE_ALL(),

    /**
     * Increases damage against arthropod targets
     */
    DAMAGE_ARTHROPODS(),

    /**
     * Increases damage against undead targets
     */
    DAMAGE_UNDEAD(),

    /**
     * Increases walking speed while in water
     */
    DEPTH_STRIDER(),

    /**
     * Increases the rate at which you mine/dig
     */
    DIG_SPEED(),

    /**
     * Decreases the rate at which a tool looses durability
     */
    DURABILITY(),

    /**
     * When attacking a target, has a chance to set them on fire
     */
    FIRE_ASPECT(),

    /**
     * Freezes any still water adjacent to ice / frost which player is walking on
     */
    FROST_WALKER(),

    /**
     * All damage to other targets will knock them back when hit
     */
    KNOCKBACK(),

    /**
     * Provides a chance of gaining extra loot when destroying blocks
     */
    LOOT_BONUS_BLOCKS(),

    /**
     * Provides a chance of gaining extra loot when killing monsters
     */
    LOOT_BONUS_MOBS(),

    /**
     * Decreases odds of catching worthless junk
     */
    LUCK(),

    /**
     * Increases rate of fish biting your hook
     */
    LURE(),

    /**
     * Allows mending the item using experience orbs
     */
    MENDING(),

    /**
     * Decreases the rate of air loss whilst underwater
     */
    OXYGEN(),



    /**
     * Allows blocks to drop themselves instead of fragments (for example, stone instead of cobblestone)
     */
    SILK_TOUCH(),

    /**
     * Damages the attacker
     */
    THORNS(),

    /**
     * Increases the speed at which a player mines underwater
     */
    WATER_WORKER(),


    fun conflictsWith(other: Enchantment): Boolean {

    }


    fun fromId(id: Int): EnchantmentType? {
        EnchantmentType.values().forEach { if(it.id == id) return it; }
        return null;
    }
}