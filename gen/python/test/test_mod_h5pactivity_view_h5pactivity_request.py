# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_h5pactivity_view_h5pactivity_request import ModH5pactivityViewH5pactivityRequest

class TestModH5pactivityViewH5pactivityRequest(unittest.TestCase):
    """ModH5pactivityViewH5pactivityRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModH5pactivityViewH5pactivityRequest:
        """Test ModH5pactivityViewH5pactivityRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModH5pactivityViewH5pactivityRequest`
        """
        model = ModH5pactivityViewH5pactivityRequest()
        if include_optional:
            return ModH5pactivityViewH5pactivityRequest(
                h5pactivityid = 56
            )
        else:
            return ModH5pactivityViewH5pactivityRequest(
                h5pactivityid = 56,
        )
        """

    def testModH5pactivityViewH5pactivityRequest(self):
        """Test ModH5pactivityViewH5pactivityRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()