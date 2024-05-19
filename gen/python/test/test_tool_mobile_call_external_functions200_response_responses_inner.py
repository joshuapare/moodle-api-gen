# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_mobile_call_external_functions200_response_responses_inner import ToolMobileCallExternalFunctions200ResponseResponsesInner

class TestToolMobileCallExternalFunctions200ResponseResponsesInner(unittest.TestCase):
    """ToolMobileCallExternalFunctions200ResponseResponsesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolMobileCallExternalFunctions200ResponseResponsesInner:
        """Test ToolMobileCallExternalFunctions200ResponseResponsesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolMobileCallExternalFunctions200ResponseResponsesInner`
        """
        model = ToolMobileCallExternalFunctions200ResponseResponsesInner()
        if include_optional:
            return ToolMobileCallExternalFunctions200ResponseResponsesInner(
                data = 'null',
                error = True,
                exception = 'null'
            )
        else:
            return ToolMobileCallExternalFunctions200ResponseResponsesInner(
        )
        """

    def testToolMobileCallExternalFunctions200ResponseResponsesInner(self):
        """Test ToolMobileCallExternalFunctions200ResponseResponsesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
