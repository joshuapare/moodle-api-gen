# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enrol_guest_get_instance_info_request import EnrolGuestGetInstanceInfoRequest

class TestEnrolGuestGetInstanceInfoRequest(unittest.TestCase):
    """EnrolGuestGetInstanceInfoRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnrolGuestGetInstanceInfoRequest:
        """Test EnrolGuestGetInstanceInfoRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnrolGuestGetInstanceInfoRequest`
        """
        model = EnrolGuestGetInstanceInfoRequest()
        if include_optional:
            return EnrolGuestGetInstanceInfoRequest(
                instanceid = 56
            )
        else:
            return EnrolGuestGetInstanceInfoRequest(
                instanceid = 56,
        )
        """

    def testEnrolGuestGetInstanceInfoRequest(self):
        """Test EnrolGuestGetInstanceInfoRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
