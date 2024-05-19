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
    /// ModGlossaryGetAuthors200Response
    /// </summary>
    [DataContract(Name = "mod_glossary_get_authors_200_response")]
    public partial class ModGlossaryGetAuthors200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetAuthors200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModGlossaryGetAuthors200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetAuthors200Response" /> class.
        /// </summary>
        /// <param name="authors">authors (required).</param>
        /// <param name="count">The total number of records. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModGlossaryGetAuthors200Response(List<ModGlossaryGetAuthors200ResponseAuthorsInner> authors = default(List<ModGlossaryGetAuthors200ResponseAuthorsInner>), int count = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "authors" is required (not null)
            if (authors == null)
            {
                throw new ArgumentNullException("authors is a required property for ModGlossaryGetAuthors200Response and cannot be null");
            }
            this.Authors = authors;
            this.Count = count;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Authors
        /// </summary>
        [DataMember(Name = "authors", IsRequired = true, EmitDefaultValue = true)]
        public List<ModGlossaryGetAuthors200ResponseAuthorsInner> Authors { get; set; }

        /// <summary>
        /// The total number of records.
        /// </summary>
        /// <value>The total number of records.</value>
        [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
        public int Count { get; set; }

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
            sb.Append("class ModGlossaryGetAuthors200Response {\n");
            sb.Append("  Authors: ").Append(Authors).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
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
