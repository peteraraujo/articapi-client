package com.peteraraujo.articapi.mock.responses

// language=json
const val MOCK_404_NOT_FOUND_RESPONSE = """
    {
"status": 404,
"error": "Not found",
"detail": "The item you requested cannot be found."
}
"""

// language=json
const val MOCK_404_SOMETHING_WENT_WRONG_RESPONSE = """
{
"status": 404,
"error": "Sorry, something went wrong.",
"detail": "An unrecognized exception was thrown. Our developers have been alerted to the situation."
}
"""