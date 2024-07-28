package com.peteraraujo.articapi.client

import io.ktor.client.engine.winhttp.WinHttp

internal actual val defaultEngine = WinHttp.create()