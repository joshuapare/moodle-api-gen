/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_unallocate_licenses_request_licenses_inner")]
    public partial class BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner" /> class.
        /// </summary>
        /// <param name="licensecourseid">Course ID.</param>
        /// <param name="licenseid">License ID.</param>
        /// <param name="userid">User ID.</param>
        public BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner(int licensecourseid = default(int), int licenseid = default(int), int userid = default(int))
        {
            this.Licensecourseid = licensecourseid;
            this.Licenseid = licenseid;
            this.Userid = userid;
        }

        /// <summary>
        /// Course ID
        /// </summary>
        /// <value>Course ID</value>
        [DataMember(Name = "licensecourseid", EmitDefaultValue = false)]
        public int Licensecourseid { get; set; }

        /// <summary>
        /// License ID
        /// </summary>
        /// <value>License ID</value>
        [DataMember(Name = "licenseid", EmitDefaultValue = false)]
        public int Licenseid { get; set; }

        /// <summary>
        /// User ID
        /// </summary>
        /// <value>User ID</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner {\n");
            sb.Append("  Licensecourseid: ").Append(Licensecourseid).Append("\n");
            sb.Append("  Licenseid: ").Append(Licenseid).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
