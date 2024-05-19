# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_data_get_entries200_response_entries_inner_contents_inner import ModDataGetEntries200ResponseEntriesInnerContentsInner

class TestModDataGetEntries200ResponseEntriesInnerContentsInner(unittest.TestCase):
    """ModDataGetEntries200ResponseEntriesInnerContentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModDataGetEntries200ResponseEntriesInnerContentsInner:
        """Test ModDataGetEntries200ResponseEntriesInnerContentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModDataGetEntries200ResponseEntriesInnerContentsInner`
        """
        model = ModDataGetEntries200ResponseEntriesInnerContentsInner()
        if include_optional:
            return ModDataGetEntries200ResponseEntriesInnerContentsInner(
                content = 'null',
                content1 = '',
                content2 = '',
                content3 = '',
                content4 = '',
                fieldid = 56,
                files = [
                    openapi_client.models.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner.core_blog_get_entries_200_response_entries_inner_summaryfiles_inner(
                        filename = '', 
                        filepath = '', 
                        filesize = 56, 
                        fileurl = '', 
                        isexternalfile = True, 
                        mimetype = '', 
                        repositorytype = '', 
                        timemodified = 56, )
                    ],
                id = 56,
                recordid = 56
            )
        else:
            return ModDataGetEntries200ResponseEntriesInnerContentsInner(
        )
        """

    def testModDataGetEntries200ResponseEntriesInnerContentsInner(self):
        """Test ModDataGetEntries200ResponseEntriesInnerContentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
