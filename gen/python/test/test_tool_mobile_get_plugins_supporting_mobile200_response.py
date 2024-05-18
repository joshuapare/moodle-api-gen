# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_mobile_get_plugins_supporting_mobile200_response import ToolMobileGetPluginsSupportingMobile200Response

class TestToolMobileGetPluginsSupportingMobile200Response(unittest.TestCase):
    """ToolMobileGetPluginsSupportingMobile200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolMobileGetPluginsSupportingMobile200Response:
        """Test ToolMobileGetPluginsSupportingMobile200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolMobileGetPluginsSupportingMobile200Response`
        """
        model = ToolMobileGetPluginsSupportingMobile200Response()
        if include_optional:
            return ToolMobileGetPluginsSupportingMobile200Response(
                plugins = [
                    openapi_client.models.tool_mobile_get_plugins_supporting_mobile_200_response_plugins_inner.tool_mobile_get_plugins_supporting_mobile_200_response_plugins_inner(
                        addon = 'null', 
                        component = 'null', 
                        dependencies = [
                            None
                            ], 
                        filehash = 'null', 
                        filesize = 56, 
                        fileurl = 'null', 
                        handlers = 'null', 
                        lang = 'null', 
                        version = 'null', )
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
            return ToolMobileGetPluginsSupportingMobile200Response(
                plugins = [
                    openapi_client.models.tool_mobile_get_plugins_supporting_mobile_200_response_plugins_inner.tool_mobile_get_plugins_supporting_mobile_200_response_plugins_inner(
                        addon = 'null', 
                        component = 'null', 
                        dependencies = [
                            None
                            ], 
                        filehash = 'null', 
                        filesize = 56, 
                        fileurl = 'null', 
                        handlers = 'null', 
                        lang = 'null', 
                        version = 'null', )
                    ],
        )
        """

    def testToolMobileGetPluginsSupportingMobile200Response(self):
        """Test ToolMobileGetPluginsSupportingMobile200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()