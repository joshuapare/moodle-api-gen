# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_enrol_unenrol_user_enrolment200_response_errors_inner import CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner

class TestCoreEnrolUnenrolUserEnrolment200ResponseErrorsInner(unittest.TestCase):
    """CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner:
        """Test CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner`
        """
        model = CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner()
        if include_optional:
            return CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner(
                key = 'null',
                message = 'null'
            )
        else:
            return CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner(
        )
        """

    def testCoreEnrolUnenrolUserEnrolment200ResponseErrorsInner(self):
        """Test CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
