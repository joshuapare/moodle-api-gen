# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_dataprivacy_get_activity_options200_response_options_inner import ToolDataprivacyGetActivityOptions200ResponseOptionsInner

class TestToolDataprivacyGetActivityOptions200ResponseOptionsInner(unittest.TestCase):
    """ToolDataprivacyGetActivityOptions200ResponseOptionsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolDataprivacyGetActivityOptions200ResponseOptionsInner:
        """Test ToolDataprivacyGetActivityOptions200ResponseOptionsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolDataprivacyGetActivityOptions200ResponseOptionsInner`
        """
        model = ToolDataprivacyGetActivityOptions200ResponseOptionsInner()
        if include_optional:
            return ToolDataprivacyGetActivityOptions200ResponseOptionsInner(
                displayname = 'null',
                name = 'null'
            )
        else:
            return ToolDataprivacyGetActivityOptions200ResponseOptionsInner(
        )
        """

    def testToolDataprivacyGetActivityOptions200ResponseOptionsInner(self):
        """Test ToolDataprivacyGetActivityOptions200ResponseOptionsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
