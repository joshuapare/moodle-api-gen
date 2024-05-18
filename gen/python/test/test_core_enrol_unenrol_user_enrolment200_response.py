# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_enrol_unenrol_user_enrolment200_response import CoreEnrolUnenrolUserEnrolment200Response

class TestCoreEnrolUnenrolUserEnrolment200Response(unittest.TestCase):
    """CoreEnrolUnenrolUserEnrolment200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreEnrolUnenrolUserEnrolment200Response:
        """Test CoreEnrolUnenrolUserEnrolment200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreEnrolUnenrolUserEnrolment200Response`
        """
        model = CoreEnrolUnenrolUserEnrolment200Response()
        if include_optional:
            return CoreEnrolUnenrolUserEnrolment200Response(
                errors = [
                    openapi_client.models.core_enrol_unenrol_user_enrolment_200_response_errors_inner.core_enrol_unenrol_user_enrolment_200_response_errors_inner(
                        key = 'null', 
                        message = 'null', )
                    ],
                result = True
            )
        else:
            return CoreEnrolUnenrolUserEnrolment200Response(
                errors = [
                    openapi_client.models.core_enrol_unenrol_user_enrolment_200_response_errors_inner.core_enrol_unenrol_user_enrolment_200_response_errors_inner(
                        key = 'null', 
                        message = 'null', )
                    ],
                result = True,
        )
        """

    def testCoreEnrolUnenrolUserEnrolment200Response(self):
        """Test CoreEnrolUnenrolUserEnrolment200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()