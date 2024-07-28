package com.peteraraujo.articapi.mock.responses

// language=json
const val MOCK_MODEL_SINGLE_RESPONSE = """
    {
  "data": {
    "id": 1,
    "title": "Mock Title"
    },
  "info": {
    "license_text": "License text",
    "license_links": [
      "https://www.example.com/license/",
      "https://www.example.com/terms"
    ],
    "version": "1.10"
  },
  "config": {
    "iiif_url": "https://www.example.com/iiif/1",
    "website_url": "https://www.example.com"
  }
}
"""

// language=json
const val MOCK_MODEL_LIST_RESPONSE = """
    {
  "pagination": {
    "total": 10,
    "limit": 2,
    "offset": 0,
    "total_pages": 5,
    "current_page": 1,
    "next_url": "https://www.example.com/api/v1/mock?page=2&limit=2"
  },
  "data": [
    {
    "id": 1,
    "title": "Mock Title"
    },
        {
    "id": 2,
    "title": "Mock Title 2"
    }
  ],
  "info": {
    "license_text": "License text",
    "license_links": [
      "https://www.example.com/license/",
      "https://www.example.com/terms"
    ],
    "version": "1.10"
  },
  "config": {
    "iiif_url": "https://www.example.com/iiif/2",
    "website_url": "https://www.example.com"
  }
}
"""

// language=json
const val MOCK_MODEL_LIST_TITLE_ONLY_RESPONSE = """
    {
  "pagination": {
    "total": 10,
    "limit": 2,
    "offset": 0,
    "total_pages": 5,
    "current_page": 1,
    "next_url": "https://www.example.com/api/v1/mock?page=2&limit=2"
  },
  "data": [
    {
    "title": "Mock Title"
    },
        {
    "title": "Mock Title 2"
    }
  ],
  "info": {
    "license_text": "License text",
    "license_links": [
      "https://www.example.com/license/",
      "https://www.example.com/terms"
    ],
    "version": "1.10"
  },
  "config": {
    "iiif_url": "https://www.example.com/iiif/2",
    "website_url": "https://www.example.com"
  }
}
"""

// language=json
const val MOCK_MODEL_EMPTY_LIST_RESPONSE = """
    {
"pagination": {
"total": 0,
"limit": 10,
"offset": 0,
"total_pages": 0,
"current_page": 1
},
  "data": [],
  "info": {
    "license_text": "License text",
    "license_links": [
      "https://www.example.com/license/",
      "https://www.example.com/terms"
    ],
    "version": "1.10"
  },
  "config": {
    "iiif_url": "https://www.example.com/iiif/2",
    "website_url": "https://www.example.com"
  }
}
"""

// language=json
const val MOCK_MODEL_SINGLE_RESPONSE_UNKNOWN_KEY = """
    {
  "data": {
    "key": "value",
    "id": 1,
    "title": "Mock Title"
    },
  "info": {
    "license_text": "License text",
    "license_links": [
      "https://www.example.com/license/",
      "https://www.example.com/terms"
    ],
    "version": "1.10"
  },
  "config": {
    "iiif_url": "https://www.example.com/iiif/1",
    "website_url": "https://www.example.com"
  }
}
"""