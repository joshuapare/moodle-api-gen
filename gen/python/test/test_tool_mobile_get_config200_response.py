# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_mobile_get_config200_response import ToolMobileGetConfig200Response

class TestToolMobileGetConfig200Response(unittest.TestCase):
    """ToolMobileGetConfig200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolMobileGetConfig200Response:
        """Test ToolMobileGetConfig200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolMobileGetConfig200Response`
        """
        model = ToolMobileGetConfig200Response()
        if include_optional:
            return ToolMobileGetConfig200Response(
                settings = [
                    openapi_client.models.tool_mobile_get_config_200_response_settings_inner.tool_mobile_get_config_200_response_settings_inner(
                        name = 'null', 
                        value = 'null', )
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
            return ToolMobileGetConfig200Response(
                settings = [
                    openapi_client.models.tool_mobile_get_config_200_response_settings_inner.tool_mobile_get_config_200_response_settings_inner(
                        name = 'null', 
                        value = 'null', )
                    ],
        )
        """

    def testToolMobileGetConfig200Response(self):
        """Test ToolMobileGetConfig200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
