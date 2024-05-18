# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_assign_courses_request_courses_inner import BlockIomadCompanyAdminAssignCoursesRequestCoursesInner

class TestBlockIomadCompanyAdminAssignCoursesRequestCoursesInner(unittest.TestCase):
    """BlockIomadCompanyAdminAssignCoursesRequestCoursesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminAssignCoursesRequestCoursesInner:
        """Test BlockIomadCompanyAdminAssignCoursesRequestCoursesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminAssignCoursesRequestCoursesInner`
        """
        model = BlockIomadCompanyAdminAssignCoursesRequestCoursesInner()
        if include_optional:
            return BlockIomadCompanyAdminAssignCoursesRequestCoursesInner(
                companyid = 56,
                courseid = 56,
                departmentid = 56,
                licensed = True,
                owned = True
            )
        else:
            return BlockIomadCompanyAdminAssignCoursesRequestCoursesInner(
        )
        """

    def testBlockIomadCompanyAdminAssignCoursesRequestCoursesInner(self):
        """Test BlockIomadCompanyAdminAssignCoursesRequestCoursesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
