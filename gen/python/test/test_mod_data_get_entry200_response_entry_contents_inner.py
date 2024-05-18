# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_data_get_entry200_response_entry_contents_inner import ModDataGetEntry200ResponseEntryContentsInner

class TestModDataGetEntry200ResponseEntryContentsInner(unittest.TestCase):
    """ModDataGetEntry200ResponseEntryContentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModDataGetEntry200ResponseEntryContentsInner:
        """Test ModDataGetEntry200ResponseEntryContentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModDataGetEntry200ResponseEntryContentsInner`
        """
        model = ModDataGetEntry200ResponseEntryContentsInner()
        if include_optional:
            return ModDataGetEntry200ResponseEntryContentsInner(
                content = '',
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
            return ModDataGetEntry200ResponseEntryContentsInner(
        )
        """

    def testModDataGetEntry200ResponseEntryContentsInner(self):
        """Test ModDataGetEntry200ResponseEntryContentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
