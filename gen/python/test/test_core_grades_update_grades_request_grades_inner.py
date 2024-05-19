# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_update_grades_request_grades_inner import CoreGradesUpdateGradesRequestGradesInner

class TestCoreGradesUpdateGradesRequestGradesInner(unittest.TestCase):
    """CoreGradesUpdateGradesRequestGradesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesUpdateGradesRequestGradesInner:
        """Test CoreGradesUpdateGradesRequestGradesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesUpdateGradesRequestGradesInner`
        """
        model = CoreGradesUpdateGradesRequestGradesInner()
        if include_optional:
            return CoreGradesUpdateGradesRequestGradesInner(
                grade = 1.337,
                str_feedback = 'null',
                studentid = 56
            )
        else:
            return CoreGradesUpdateGradesRequestGradesInner(
        )
        """

    def testCoreGradesUpdateGradesRequestGradesInner(self):
        """Test CoreGradesUpdateGradesRequestGradesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
