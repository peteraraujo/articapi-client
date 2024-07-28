package com.peteraraujo.articapi.exceptions

sealed class ArticApiException(override val message: String) : Exception(message)

class InvalidNumberOfResultsException : ArticApiException("Invalid number of results.")

class InvalidLimitException : ArticApiException("Invalid limit.")

class ItemNotFoundException : ArticApiException("The item you requested cannot be found.")