/*
 * Copyright 2020 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sun.net.www.protocol.greatness;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class GreatURLConnection extends URLConnection {
    /**
     * Constructs a URL connection to the specified URL. A connection to the object referenced by the URL is not
     * created.
     *
     * @param url the specified URL.
     */
    protected GreatURLConnection(final URL url) {
        super(url);
    }

    @Override
    public void connect() throws IOException {
        System.out.println("You are connected to greatness.");
    }
}
