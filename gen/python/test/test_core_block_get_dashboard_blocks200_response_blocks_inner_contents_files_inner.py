# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_block_get_dashboard_blocks200_response_blocks_inner_contents_files_inner import CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner

class TestCoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner(unittest.TestCase):
    """CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner:
        """Test CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`
        """
        model = CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner()
        if include_optional:
            return CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner(
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
            return CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner(
        )
        """

    def testCoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner(self):
        """Test CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()