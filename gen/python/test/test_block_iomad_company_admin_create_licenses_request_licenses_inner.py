# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_create_licenses_request_licenses_inner import BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

class TestBlockIomadCompanyAdminCreateLicensesRequestLicensesInner(unittest.TestCase):
    """BlockIomadCompanyAdminCreateLicensesRequestLicensesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminCreateLicensesRequestLicensesInner:
        """Test BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminCreateLicensesRequestLicensesInner`
        """
        model = BlockIomadCompanyAdminCreateLicensesRequestLicensesInner()
        if include_optional:
            return BlockIomadCompanyAdminCreateLicensesRequestLicensesInner(
                allocation = 56,
                clearonexpire = 56,
                companyid = 56,
                courses = [
                    openapi_client.models.block_iomad_company_admin_create_licenses_request_licenses_inner_courses_inner.block_iomad_company_admin_create_licenses_request_licenses_inner_courses_inner(
                        courseid = 56, )
                    ],
                cutoffdate = 56,
                expirydate = 56,
                instant = 56,
                name = 'null',
                parentid = 56,
                program = 56,
                reference = 'null',
                startdate = 56,
                type = 56,
                used = 56,
                validlength = 56
            )
        else:
            return BlockIomadCompanyAdminCreateLicensesRequestLicensesInner(
        )
        """

    def testBlockIomadCompanyAdminCreateLicensesRequestLicensesInner(self):
        """Test BlockIomadCompanyAdminCreateLicensesRequestLicensesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()