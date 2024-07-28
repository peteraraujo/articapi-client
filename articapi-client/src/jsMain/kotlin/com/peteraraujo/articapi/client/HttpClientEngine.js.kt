package com.peteraraujo.articapi.client

import io.ktor.client.engine.js.Js

internal actual val defaultEngine = Js.create()