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


enum class Biome(id: Int) {
    BEACHES(),
    BIRCH_FOREST,
    BIRCH_FOREST_HILLS,
    COLD_BEACH,
    DEEP_OCEAN,
    DESERT(2),
    DESERT_HILLS,
    EXTREME_HILLS,
    EXTREME_HILLS_WITH_TREES,
    FOREST,
    FOREST_HILLS,
    FROZEN_OCEAN,
    FROZEN_RIVER,
    HELL,
    ICE_FLATS,
    ICE_MOUNTAINS,
    JUNGLE,
    JUNGLE_EDGE,
    JUNGLE_HILLS,
    MESA,
    MESA_CLEAR_ROCK,
    MESA_ROCK,
    MUSHROOM_ISLAND,
    MUSHROOM_ISLAND_SHORE,
    MUTATED_BIRCH_FOREST,
    MUTATED_BIRCH_FOREST_HILLS,
    MUTATED_DESERT,
    MUTATED_EXTREME_HILLS,
    MUTATED_EXTREME_HILLS_WITH_TREES,
    MUTATED_FOREST,
    MUTATED_ICE_FLATS,
    MUTATED_JUNGLE,
    MUTATED_JUNGLE_EDGE,
    MUTATED_MESA,
    MUTATED_MESA_CLEAR_ROCK,
    MUTATED_MESA_ROCK,
    MUTATED_PLAINS,
    MUTATED_REDWOOD_TAIGA,
    MUTATED_REDWOOD_TAIGA_HILLS,
    MUTATED_ROOFED_FOREST,
    MUTATED_SAVANNA,
    MUTATED_SAVANNA_ROCK,
    MUTATED_SWAMPLAND,
    MUTATED_TAIGA,
    MUTATED_TAIGA_COLD,
    OCEAN(0),
    PLAINS(1),
    REDWOOD_TAIGA,
    REDWOOD_TAIGA_HILLS,
    RIVER,
    ROOFED_FOREST,
    SAVANNA,
    SAVANNA_ROCK,
    SKY,
    SMALLER_EXTREME_HILLS,
    STONE_BEACH,
    SWAMPLAND,
    TAIGA,
    TAIGA_COLD,
    TAIGA_COLD_HILLS,
    TAIGA_HILLS,
    VOID;


    val id: Int = id;
    //val temperature: Double = temperature;


    fun fromId(id: Int) = Biome.values().filter { it.id == id }.first();
}