# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_block_get_course_blocks200_response import CoreBlockGetCourseBlocks200Response

class TestCoreBlockGetCourseBlocks200Response(unittest.TestCase):
    """CoreBlockGetCourseBlocks200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreBlockGetCourseBlocks200Response:
        """Test CoreBlockGetCourseBlocks200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreBlockGetCourseBlocks200Response`
        """
        model = CoreBlockGetCourseBlocks200Response()
        if include_optional:
            return CoreBlockGetCourseBlocks200Response(
                blocks = [
                    openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner.core_block_get_course_blocks_200_response_blocks_inner(
                        collapsible = True, 
                        configs = [
                            openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner_configs_inner.core_block_get_course_blocks_200_response_blocks_inner_configs_inner(
                                name = 'null', 
                                type = 'null', 
                                value = 'null', )
                            ], 
                        contents = openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner_contents.core_block_get_course_blocks_200_response_blocks_inner_contents(
                            content = 'null', 
                            contentformat = 56, 
                            files = [
                                openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_course_blocks_200_response_blocks_inner_contents_files_inner(
                                    filename = 'null', 
                                    filepath = 'null', 
                                    filesize = 56, 
                                    fileurl = 'null', 
                                    isexternalfile = True, 
                                    mimetype = 'null', 
                                    repositorytype = 'null', 
                                    timemodified = 56, )
                                ], 
                            footer = 'null', 
                            title = 'null', ), 
                        dockable = True, 
                        instanceid = 56, 
                        name = 'null', 
                        positionid = 56, 
                        region = 'null', 
                        visible = True, 
                        weight = 56, )
                    ],
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return CoreBlockGetCourseBlocks200Response(
                blocks = [
                    openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner.core_block_get_course_blocks_200_response_blocks_inner(
                        collapsible = True, 
                        configs = [
                            openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner_configs_inner.core_block_get_course_blocks_200_response_blocks_inner_configs_inner(
                                name = 'null', 
                                type = 'null', 
                                value = 'null', )
                            ], 
                        contents = openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner_contents.core_block_get_course_blocks_200_response_blocks_inner_contents(
                            content = 'null', 
                            contentformat = 56, 
                            files = [
                                openapi_client.models.core_block_get_course_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_course_blocks_200_response_blocks_inner_contents_files_inner(
                                    filename = 'null', 
                                    filepath = 'null', 
                                    filesize = 56, 
                                    fileurl = 'null', 
                                    isexternalfile = True, 
                                    mimetype = 'null', 
                                    repositorytype = 'null', 
                                    timemodified = 56, )
                                ], 
                            footer = 'null', 
                            title = 'null', ), 
                        dockable = True, 
                        instanceid = 56, 
                        name = 'null', 
                        positionid = 56, 
                        region = 'null', 
                        visible = True, 
                        weight = 56, )
                    ],
        )
        """

    def testCoreBlockGetCourseBlocks200Response(self):
        """Test CoreBlockGetCourseBlocks200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
