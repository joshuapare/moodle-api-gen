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
    /// CoreBlockFetchAddableBlocksRequest
    /// </summary>
    [DataContract(Name = "core_block_fetch_addable_blocks_request")]
    public partial class CoreBlockFetchAddableBlocksRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlockFetchAddableBlocksRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreBlockFetchAddableBlocksRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlockFetchAddableBlocksRequest" /> class.
        /// </summary>
        /// <param name="pagecontextid">The context ID of the page. (required) (default to null).</param>
        /// <param name="pagehash">Page hash (default to &quot;&quot;).</param>
        /// <param name="pagelayout">The layout of the page. (required) (default to &quot;null&quot;).</param>
        /// <param name="pagetype">The type of the page. (required) (default to &quot;null&quot;).</param>
        /// <param name="subpage">The subpage identifier (default to &quot;&quot;).</param>
        public CoreBlockFetchAddableBlocksRequest(int pagecontextid = null, string pagehash = @"", string pagelayout = @"null", string pagetype = @"null", string subpage = @"")
        {
            this.Pagecontextid = pagecontextid;
            // to ensure "pagelayout" is required (not null)
            if (pagelayout == null)
            {
                throw new ArgumentNullException("pagelayout is a required property for CoreBlockFetchAddableBlocksRequest and cannot be null");
            }
            this.Pagelayout = pagelayout;
            // to ensure "pagetype" is required (not null)
            if (pagetype == null)
            {
                throw new ArgumentNullException("pagetype is a required property for CoreBlockFetchAddableBlocksRequest and cannot be null");
            }
            this.Pagetype = pagetype;
            // use default value if no "pagehash" provided
            this.Pagehash = pagehash ?? @"";
            // use default value if no "subpage" provided
            this.Subpage = subpage ?? @"";
        }

        /// <summary>
        /// The context ID of the page.
        /// </summary>
        /// <value>The context ID of the page.</value>
        [DataMember(Name = "pagecontextid", IsRequired = true, EmitDefaultValue = true)]
        public int Pagecontextid { get; set; }

        /// <summary>
        /// Page hash
        /// </summary>
        /// <value>Page hash</value>
        [DataMember(Name = "pagehash", EmitDefaultValue = false)]
        public string Pagehash { get; set; }

        /// <summary>
        /// The layout of the page.
        /// </summary>
        /// <value>The layout of the page.</value>
        [DataMember(Name = "pagelayout", IsRequired = true, EmitDefaultValue = true)]
        public string Pagelayout { get; set; }

        /// <summary>
        /// The type of the page.
        /// </summary>
        /// <value>The type of the page.</value>
        [DataMember(Name = "pagetype", IsRequired = true, EmitDefaultValue = true)]
        public string Pagetype { get; set; }

        /// <summary>
        /// The subpage identifier
        /// </summary>
        /// <value>The subpage identifier</value>
        [DataMember(Name = "subpage", EmitDefaultValue = false)]
        public string Subpage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBlockFetchAddableBlocksRequest {\n");
            sb.Append("  Pagecontextid: ").Append(Pagecontextid).Append("\n");
            sb.Append("  Pagehash: ").Append(Pagehash).Append("\n");
            sb.Append("  Pagelayout: ").Append(Pagelayout).Append("\n");
            sb.Append("  Pagetype: ").Append(Pagetype).Append("\n");
            sb.Append("  Subpage: ").Append(Subpage).Append("\n");
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
