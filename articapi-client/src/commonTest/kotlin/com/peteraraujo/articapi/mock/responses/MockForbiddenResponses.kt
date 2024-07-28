package com.peteraraujo.articapi.mock.responses

// language=json
const val MOCK_403_INVALID_LIMIT_RESPONSE = """
{
"status": 403,
"error": "Invalid limit",
"detail": "You have requested too many resources per page. Please set a smaller limit."
}
"""

// language=json
const val MOCK_403_INVALID_NUMBER_OF_RESULTS_RESPONSE = """
{
"status": 403,
"error": "Invalid number of results",
"detail": "You have requested too many results. Please refine your parameters."
}
"""