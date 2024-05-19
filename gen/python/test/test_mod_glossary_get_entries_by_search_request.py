# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_glossary_get_entries_by_search_request import ModGlossaryGetEntriesBySearchRequest

class TestModGlossaryGetEntriesBySearchRequest(unittest.TestCase):
    """ModGlossaryGetEntriesBySearchRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModGlossaryGetEntriesBySearchRequest:
        """Test ModGlossaryGetEntriesBySearchRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModGlossaryGetEntriesBySearchRequest`
        """
        model = ModGlossaryGetEntriesBySearchRequest()
        if include_optional:
            return ModGlossaryGetEntriesBySearchRequest(
                var_from = 56,
                fullsearch = True,
                id = 56,
                limit = 56,
                options = openapi_client.models.mod_glossary_get_entries_by_author_request_options.mod_glossary_get_entries_by_author_request_options(
                    includenotapproved = True, ),
                order = 'CONCEPT',
                query = 'null',
                sort = 'ASC'
            )
        else:
            return ModGlossaryGetEntriesBySearchRequest(
                id = 56,
                query = 'null',
        )
        """

    def testModGlossaryGetEntriesBySearchRequest(self):
        """Test ModGlossaryGetEntriesBySearchRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
