# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_h5pactivity_get_h5pactivity_access_information_request import ModH5pactivityGetH5pactivityAccessInformationRequest

class TestModH5pactivityGetH5pactivityAccessInformationRequest(unittest.TestCase):
    """ModH5pactivityGetH5pactivityAccessInformationRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModH5pactivityGetH5pactivityAccessInformationRequest:
        """Test ModH5pactivityGetH5pactivityAccessInformationRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModH5pactivityGetH5pactivityAccessInformationRequest`
        """
        model = ModH5pactivityGetH5pactivityAccessInformationRequest()
        if include_optional:
            return ModH5pactivityGetH5pactivityAccessInformationRequest(
                h5pactivityid = 56
            )
        else:
            return ModH5pactivityGetH5pactivityAccessInformationRequest(
                h5pactivityid = 56,
        )
        """

    def testModH5pactivityGetH5pactivityAccessInformationRequest(self):
        """Test ModH5pactivityGetH5pactivityAccessInformationRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()