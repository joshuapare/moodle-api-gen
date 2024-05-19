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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner
    /// </summary>
    [DataContract(Name = "core_cohort_update_cohorts_request_cohorts_inner_customfields_inner")]
    public partial class CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner" /> class.
        /// </summary>
        /// <param name="shortname">The shortname of the custom field.</param>
        /// <param name="value">The value of the custom field.</param>
        public CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner(string shortname = default(string), string value = default(string))
        {
            this.Shortname = shortname;
            this.Value = value;
        }

        /// <summary>
        /// The shortname of the custom field
        /// </summary>
        /// <value>The shortname of the custom field</value>
        [DataMember(Name = "shortname", EmitDefaultValue = false)]
        public string Shortname { get; set; }

        /// <summary>
        /// The value of the custom field
        /// </summary>
        /// <value>The value of the custom field</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner {\n");
            sb.Append("  Shortname: ").Append(Shortname).Append("\n");
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
