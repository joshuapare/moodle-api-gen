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
    /// GradereportUserGetGradeItems200Response
    /// </summary>
    [DataContract(Name = "gradereport_user_get_grade_items_200_response")]
    public partial class GradereportUserGetGradeItems200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportUserGetGradeItems200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GradereportUserGetGradeItems200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportUserGetGradeItems200Response" /> class.
        /// </summary>
        /// <param name="usergrades">usergrades (required).</param>
        /// <param name="warnings">warnings.</param>
        public GradereportUserGetGradeItems200Response(List<GradereportUserGetGradeItems200ResponseUsergradesInner> usergrades = default(List<GradereportUserGetGradeItems200ResponseUsergradesInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "usergrades" is required (not null)
            if (usergrades == null)
            {
                throw new ArgumentNullException("usergrades is a required property for GradereportUserGetGradeItems200Response and cannot be null");
            }
            this.Usergrades = usergrades;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Usergrades
        /// </summary>
        [DataMember(Name = "usergrades", IsRequired = true, EmitDefaultValue = true)]
        public List<GradereportUserGetGradeItems200ResponseUsergradesInner> Usergrades { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GradereportUserGetGradeItems200Response {\n");
            sb.Append("  Usergrades: ").Append(Usergrades).Append("\n");
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