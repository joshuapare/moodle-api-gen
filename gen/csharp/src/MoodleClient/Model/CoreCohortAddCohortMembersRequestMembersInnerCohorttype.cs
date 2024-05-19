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
    /// CoreCohortAddCohortMembersRequestMembersInnerCohorttype
    /// </summary>
    [DataContract(Name = "core_cohort_add_cohort_members_request_members_inner_cohorttype")]
    public partial class CoreCohortAddCohortMembersRequestMembersInnerCohorttype : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCohortAddCohortMembersRequestMembersInnerCohorttype" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCohortAddCohortMembersRequestMembersInnerCohorttype() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCohortAddCohortMembersRequestMembersInnerCohorttype" /> class.
        /// </summary>
        /// <param name="type">The name of the field: id                                         (numeric value of cohortid) or idnumber (alphanumeric value of idnumber)  (required) (default to &quot;null&quot;).</param>
        /// <param name="value">The value of the cohort (required) (default to &quot;null&quot;).</param>
        public CoreCohortAddCohortMembersRequestMembersInnerCohorttype(string type = @"null", string value = @"null")
        {
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for CoreCohortAddCohortMembersRequestMembersInnerCohorttype and cannot be null");
            }
            this.Type = type;
            // to ensure "value" is required (not null)
            if (value == null)
            {
                throw new ArgumentNullException("value is a required property for CoreCohortAddCohortMembersRequestMembersInnerCohorttype and cannot be null");
            }
            this.Value = value;
        }

        /// <summary>
        /// The name of the field: id                                         (numeric value of cohortid) or idnumber (alphanumeric value of idnumber) 
        /// </summary>
        /// <value>The name of the field: id                                         (numeric value of cohortid) or idnumber (alphanumeric value of idnumber) </value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// The value of the cohort
        /// </summary>
        /// <value>The value of the cohort</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCohortAddCohortMembersRequestMembersInnerCohorttype {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
