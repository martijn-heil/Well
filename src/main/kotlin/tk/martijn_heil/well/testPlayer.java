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

package tk.martijn_heil.well;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.martijn_heil.well.entity.living.Player;
import tk.martijn_heil.well.inventory.Inventory;
import tk.martijn_heil.well.localization.LocalizedString;
import tk.martijn_heil.well.nativeserver.NativeServer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.Locale;
import java.util.UUID;


public class testPlayer extends OutputStream implements Player, NativeServer
{

    @Override
    public long getFirstPlayed()
    {
        return 0;
    }


    @Override
    public long getLastPlayed()
    {
        System
        new PrintWriter(this);

        return 0;
    }


    @Override
    public boolean isOnline()
    {
        return false;
    }


    @NotNull
    @Override
    public String getUsername()
    {
        return null;
    }


    @Override
    public boolean isKnown()
    {
        return false;
    }


    @Override
    public boolean isWhitelisted()
    {
        return false;
    }


    @Override
    public void setWhitelisted(boolean b)
    {

    }


    @Override
    public boolean isBanned()
    {
        return false;
    }


    @Override
    public void setBanned(boolean b)
    {

    }


    @NotNull
    @Override
    public Location getLocation()
    {
        return null;
    }


    @NotNull
    @Override
    public Player getPlayer()
    {
        return null;
    }


    @NotNull
    @Override
    public UUID getUniqueId()
    {
        return null;
    }


    @Override
    public int compareTo(@NotNull Identifiable other)
    {
        return 0;
    }


    @Override
    public void execute(@NotNull String command)
    {

    }


    @NotNull
    @Override
    public Inventory getInventory()
    {
        return null;
    }


    @Override
    public void sendMessage(@NotNull String message)
    {

    }


    @Override
    public void sendMessage(@NotNull String[] messages)
    {

    }


    @Override
    public void sendMessage(@NotNull LocalizedString message)
    {

    }


    @Override
    public void sendMessage(@NotNull LocalizedString[] messages)
    {

    }


    @NotNull
    @Override
    public Locale getLocale()
    {
        return null;
    }


    @Override
    public void write(int b) throws IOException
    {
        Character.toChars(b);
    }


    @NotNull
    @Override
    public InetSocketAddress getAdress()
    {
        return null;
    }


    @NotNull
    @Override
    public Location getBedSpawnLocation()
    {
        return null;
    }


    @Override
    public void setBedSpawnLocation(@NotNull Location location)
    {

    }


    @Override
    public boolean getAllowFlight()
    {
        return false;
    }


    @Override
    public void setAllowFlight(boolean b)
    {

    }


    @NotNull
    @Override
    public Location getCompassTarget()
    {
        return null;
    }


    @Override
    public void setCompassTarget(@NotNull Location location)
    {

    }


    @Override
    public boolean canSee(@NotNull Player other)
    {
        return false;
    }


    @Override
    public void doChat(@NotNull String message)
    {

    }


    @NotNull
    @Override
    public ServerType getServerType()
    {
        return null;
    }


    @Nullable
    @Override
    public String getNativeServerVersion()
    {
        return null;
    }


    @Nullable
    @Override
    public String getNativeServerName()
    {
        return null;
    }
}
