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
    /// ModAssignGetUserMappings200Response
    /// </summary>
    [DataContract(Name = "mod_assign_get_user_mappings_200_response")]
    public partial class ModAssignGetUserMappings200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetUserMappings200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignGetUserMappings200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetUserMappings200Response" /> class.
        /// </summary>
        /// <param name="assignments">assignments (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModAssignGetUserMappings200Response(List<ModAssignGetUserMappings200ResponseAssignmentsInner> assignments = default(List<ModAssignGetUserMappings200ResponseAssignmentsInner>), List<ModAssignGetUserMappings200ResponseWarningsInner> warnings = default(List<ModAssignGetUserMappings200ResponseWarningsInner>))
        {
            // to ensure "assignments" is required (not null)
            if (assignments == null)
            {
                throw new ArgumentNullException("assignments is a required property for ModAssignGetUserMappings200Response and cannot be null");
            }
            this.Assignments = assignments;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Assignments
        /// </summary>
        [DataMember(Name = "assignments", IsRequired = true, EmitDefaultValue = true)]
        public List<ModAssignGetUserMappings200ResponseAssignmentsInner> Assignments { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<ModAssignGetUserMappings200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetUserMappings200Response {\n");
            sb.Append("  Assignments: ").Append(Assignments).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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