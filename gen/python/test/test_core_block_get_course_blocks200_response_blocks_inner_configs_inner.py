# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner_configs_inner import CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner

class TestCoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner(unittest.TestCase):
    """CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner:
        """Test CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner`
        """
        model = CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner()
        if include_optional:
            return CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner(
                name = 'null',
                type = 'null',
                value = 'null'
            )
        else:
            return CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner(
        )
        """

    def testCoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner(self):
        """Test CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
