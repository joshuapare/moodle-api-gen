# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_blog_get_entries200_response_entries_inner_summaryfiles_inner import CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner

class TestCoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner(unittest.TestCase):
    """CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner:
        """Test CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`
        """
        model = CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner()
        if include_optional:
            return CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner(
                filename = '',
                filepath = '',
                filesize = 56,
                fileurl = '',
                isexternalfile = True,
                mimetype = '',
                repositorytype = '',
                timemodified = 56
            )
        else:
            return CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner(
        )
        """

    def testCoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner(self):
        """Test CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
