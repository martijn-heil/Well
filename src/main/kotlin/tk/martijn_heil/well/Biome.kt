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


enum class Biome(val id: Int, val displayName: String, val temperature: Double?, val isTemperatureAffectedByAltitude: Boolean = true) {
    ICE_PLAINS(12, "ice plains", 0.0),
    ICE_PLAINS_SPIKES(140, "ice plains spikes", 0.0),
    COLD_TAIGA(30, "cold taiga", -0.5),
    COLD_TAIGA_M(158, "cold taiga M", -0.5),
    FROZEN_RIVER(11, "frozen river", 0.0),
    COLD_BEACH(26, "cold beach", 0.05),
    EXTREME_HILLS(3, "extreme hills", 0.2),
    EXTREME_HILLS_M(131, "extreme hills m", 0.2),
    EXTREME_HILLS_PLUS(34, "extreme hills+", 0.2),
    EXTREME_HILLS_PLUS_M(162, "extreme hills+ m", 0.2),
    TAIGA(5, "taiga", 0.25),
    TAIGA_M(133, "taiga m", 0.25),
    MEGA_TAIGA(32, "mega taiga", 0.3),
    MEGA_SPRUCE_TAIGA(160, "mega spruce taiga", 0.25),
    STONE_BEACH(25, "stone beach", 0.2),
    THE_END(9, "the end", 0.5),
    PLAINS(1, "plains", 0.8),
    SUNFLOWER_PLAINS(129, "sunflower plains", 0.8),
    FOREST(4, "forest", 0.7),
    FLOWER_FOREST(27, "flower forest", 0.7),
    BIRCH_FOREST(27, "birch forest", 0.6),
    BIRCH_FOREST_M(155, "birch forest m", 0.6),
    ROOFED_FOREST(29, "roofed forest", 0.7),
    ROOFED_FOREST_M(157, "roofed forest m", 0.7),
    SWAMPLAND(6, "swampland", 0.8, false),
    SWAMPLAND_M(134, "swampland m", 0.8, false),
    JUNGLE(21, "jungle", 0.95),
    JUNGLE_M(149, "jungle m", 0.95),
    JUNGLE_EDGE(23, "jungle edge", 0.95),
    JUNGLE_EDGE_M(151, "jungle edge m", 0.95),
    RIVER(7, "river", 0.5),
    BEACH(16, "beach", 0.8),
    MUSHROOM_ISLAND(14, "mushroom island", 0.9),
    MUSHROOM_ISLAND_SHORE(15, "mushroom island shore", 0.9),
    DESERT(2, "desert", 2.0),
    DESERT_M(130, "desert m", 2.0),
    SAVANNA(35, "savanna", 1.2),
    SAVANNA_M(163, "savanna m", 1.2),
    MESA(37, "mesa", 2.0),
    MESA_BRYCE(165, "mesa (bryce)", 2.0),
    MESA_PLATEAU_F(38, "mesa plateau f", 2.0),
    MESA_PLATEAU_F_M(166, "mesa plateau f m", 2.0),
    SAVANNA_PLATEAU(36, "savanna plateau", 1.2),
    MESA_PLATEAU(39, "mesa plateau", 2.0),
    HELL(8, "hell (the nether)", null),
    OCEAN(0, "ocean", 0.5),
    DEEP_OCEAN(24, "deep ocean", 0.5),
    ICE_MOUNTAINS(13, "ice mountains", 0.0),
    DESERT_HILLS(17, "desert hills", 2.0),
    FOREST_HILLS(18, "forest hills", 0.7),
    TAIGA_HILLS(19, "taiga hills", 0.25),
    JUNGLE_HILLS(22, "jungle hills", 0.7),
    BIRCH_FOREST_HILLS(28, "birch forest hills", 0.6),
    COLD_TAIGA_HILLS(31, "cold taiga hills", 0.25),
    MEGA_TAIGA_HILLS(33, "mega taiga hills", 0.25),
    BIRCH_FOREST_HILLS_M(156, "birch forest hills m", 0.6),
    REDWOOD_TAIGA_HILLS_M(161, "redwood taiga hills m", 0.25),
    PLAINS_M(128, "plains m", 0.8),
    FROZEN_OCEAN(10, "frozen ocean", 0.0),
    EXTREME_HILLS_EDGE(20, "extreme hills edge", 0.2),
    THE_VOID(127, "the void", 0.0),

