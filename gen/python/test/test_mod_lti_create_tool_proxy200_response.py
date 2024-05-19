# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_lti_create_tool_proxy200_response import ModLtiCreateToolProxy200Response

class TestModLtiCreateToolProxy200Response(unittest.TestCase):
    """ModLtiCreateToolProxy200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModLtiCreateToolProxy200Response:
        """Test ModLtiCreateToolProxy200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModLtiCreateToolProxy200Response`
        """
        model = ModLtiCreateToolProxy200Response()
        if include_optional:
            return ModLtiCreateToolProxy200Response(
                capabilityoffered = 'null',
                guid = 'null',
                id = 56,
                name = 'null',
                regurl = '',
                secret = 'null',
                serviceoffered = 'null',
                state = 56,
                timecreated = 56,
                timemodified = 56,
                toolproxy = 'null',
                vendorcode = 'null'
            )
        else:
            return ModLtiCreateToolProxy200Response(
                capabilityoffered = 'null',
                guid = 'null',
                id = 56,
                name = 'null',
                regurl = '',
                secret = 'null',
                serviceoffered = 'null',
                state = 56,
                timecreated = 56,
                timemodified = 56,
                toolproxy = 'null',
                vendorcode = 'null',
        )
        """

    def testModLtiCreateToolProxy200Response(self):
        """Test ModLtiCreateToolProxy200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
