# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_iomadpolicy_get_iomadpolicy_version200_response_result import ToolIomadpolicyGetIomadpolicyVersion200ResponseResult

class TestToolIomadpolicyGetIomadpolicyVersion200ResponseResult(unittest.TestCase):
    """ToolIomadpolicyGetIomadpolicyVersion200ResponseResult unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolIomadpolicyGetIomadpolicyVersion200ResponseResult:
        """Test ToolIomadpolicyGetIomadpolicyVersion200ResponseResult
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolIomadpolicyGetIomadpolicyVersion200ResponseResult`
        """
        model = ToolIomadpolicyGetIomadpolicyVersion200ResponseResult()
        if include_optional:
            return ToolIomadpolicyGetIomadpolicyVersion200ResponseResult(
                iomadpolicy = openapi_client.models.tool_iomadpolicy_get_iomadpolicy_version_200_response_result_iomadpolicy.tool_iomadpolicy_get_iomadpolicy_version_200_response_result_iomadpolicy(
                    content = 'null', 
                    name = 'null', 
                    versionid = 56, )
            )
        else:
            return ToolIomadpolicyGetIomadpolicyVersion200ResponseResult(
        )
        """

    def testToolIomadpolicyGetIomadpolicyVersion200ResponseResult(self):
        """Test ToolIomadpolicyGetIomadpolicyVersion200ResponseResult"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()