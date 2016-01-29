package de.lebenshilfe_muenster.uk_gebaerden_muensterland.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.lebenshilfe_muenster.uk_gebaerden_muensterland.NavigationDrawerTest;
import de.lebenshilfe_muenster.uk_gebaerden_muensterland.SignBrowserTest;

/**
 * Copyright (c) 2016 Matthias Tonhäuser
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({NavigationDrawerTest.class, SignBrowserTest.class})
public class EspressoUnitTestSuite {
}
