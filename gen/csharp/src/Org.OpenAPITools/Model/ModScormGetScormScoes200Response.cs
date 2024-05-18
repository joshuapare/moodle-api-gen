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
    /// ModScormGetScormScoes200Response
    /// </summary>
    [DataContract(Name = "mod_scorm_get_scorm_scoes_200_response")]
    public partial class ModScormGetScormScoes200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormScoes200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModScormGetScormScoes200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormScoes200Response" /> class.
        /// </summary>
        /// <param name="scoes">scoes (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModScormGetScormScoes200Response(List<ModScormGetScormScoes200ResponseScoesInner> scoes = default(List<ModScormGetScormScoes200ResponseScoesInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "scoes" is required (not null)
            if (scoes == null)
            {
                throw new ArgumentNullException("scoes is a required property for ModScormGetScormScoes200Response and cannot be null");
            }
            this.Scoes = scoes;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Scoes
        /// </summary>
        [DataMember(Name = "scoes", IsRequired = true, EmitDefaultValue = true)]
        public List<ModScormGetScormScoes200ResponseScoesInner> Scoes { get; set; }

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
            sb.Append("class ModScormGetScormScoes200Response {\n");
            sb.Append("  Scoes: ").Append(Scoes).Append("\n");
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
