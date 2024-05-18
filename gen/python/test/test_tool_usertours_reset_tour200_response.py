# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_usertours_reset_tour200_response import ToolUsertoursResetTour200Response

class TestToolUsertoursResetTour200Response(unittest.TestCase):
    """ToolUsertoursResetTour200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolUsertoursResetTour200Response:
        """Test ToolUsertoursResetTour200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolUsertoursResetTour200Response`
        """
        model = ToolUsertoursResetTour200Response()
        if include_optional:
            return ToolUsertoursResetTour200Response(
                start_tour = 56
            )
        else:
            return ToolUsertoursResetTour200Response(
        )
        """

    def testToolUsertoursResetTour200Response(self):
        """Test ToolUsertoursResetTour200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()