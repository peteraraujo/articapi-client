package com.peteraraujo.articapi.client

import io.ktor.client.engine.cio.CIO

internal actual val defaultEngine = CIO.create()