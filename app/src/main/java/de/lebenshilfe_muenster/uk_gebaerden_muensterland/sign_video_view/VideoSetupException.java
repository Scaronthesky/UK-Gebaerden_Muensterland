package de.lebenshilfe_muenster.uk_gebaerden_muensterland.sign_video_view;

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

/**
 * Dedicated exception for the VideoView.
 */
public class VideoSetupException extends RuntimeException {

    /**
     * Dedicated exception for the VideoView.
     *
     * @param message detailed message with an error code as a prefix.
     */
    public VideoSetupException(String message) {
        super(message);
    }

    /**
     * Dedicated exception for the VideoView.
     *
     * @param message detailed message with an error code as a prefix.
     * @param cause   root exception.
     */
    public VideoSetupException(String message, RuntimeException cause) {
        super(message, cause);
    }
}
