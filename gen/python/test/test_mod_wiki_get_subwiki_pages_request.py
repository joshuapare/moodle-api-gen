# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_wiki_get_subwiki_pages_request import ModWikiGetSubwikiPagesRequest

class TestModWikiGetSubwikiPagesRequest(unittest.TestCase):
    """ModWikiGetSubwikiPagesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModWikiGetSubwikiPagesRequest:
        """Test ModWikiGetSubwikiPagesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModWikiGetSubwikiPagesRequest`
        """
        model = ModWikiGetSubwikiPagesRequest()
        if include_optional:
            return ModWikiGetSubwikiPagesRequest(
                groupid = 56,
                options = openapi_client.models.mod_wiki_get_subwiki_pages_request_options.mod_wiki_get_subwiki_pages_request_options(
                    includecontent = 56, 
                    sortby = 'title', 
                    sortdirection = 'ASC', ),
                userid = 56,
                wikiid = 56
            )
        else:
            return ModWikiGetSubwikiPagesRequest(
                wikiid = 56,
        )
        """

    def testModWikiGetSubwikiPagesRequest(self):
        """Test ModWikiGetSubwikiPagesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
