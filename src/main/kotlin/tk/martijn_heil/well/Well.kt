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

import tk.martijn_heil.well.event.Event
import tk.martijn_heil.well.plugin.PluginManager
import tk.martijn_heil.well.service.ServiceManager
import java.io.File

class Well {
    companion object : WellImplementation {
        override val serviceManager: ServiceManager
            get() = implementation.serviceManager

        override fun callEvent(event: Event) = implementation.callEvent(event)

        override fun registerPluginManager(manager: PluginManager) = implementation.registerPluginManager(manager)


        override val wellRootDirectory: File
            get() = implementation.wellRootDirectory


        override val pluginManagers: Collection<PluginManager>
            get() = implementation.pluginManagers


        override val server: Server
            get() = implementation.server


        var implementation: WellImplementation
            get() = implementation
            set(value: WellImplementation) { implementation = value }
    }
}
